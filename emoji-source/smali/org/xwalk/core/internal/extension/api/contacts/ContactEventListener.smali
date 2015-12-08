.class public Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;
.super Landroid/database/ContentObserver;
.source "ContactEventListener.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ContactsEventListener"


# instance fields
.field private mContactIDs:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mContacts:Lorg/xwalk/core/internal/extension/api/contacts/Contacts;

.field private mIsListening:Z

.field private mRawID2ContactIDMaps:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRawID2VersionMaps:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mResolver:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lorg/xwalk/core/internal/extension/api/contacts/Contacts;Landroid/content/ContentResolver;)V
    .locals 1
    .param p1, "handler"    # Landroid/os/Handler;
    .param p2, "instance"    # Lorg/xwalk/core/internal/extension/api/contacts/Contacts;
    .param p3, "resolver"    # Landroid/content/ContentResolver;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mIsListening:Z

    .line 39
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContacts:Lorg/xwalk/core/internal/extension/api/contacts/Contacts;

    .line 40
    iput-object p3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mResolver:Landroid/content/ContentResolver;

    .line 41
    return-void
.end method

.method private compareAllRawContactInfo(Ljava/util/HashSet;)Ljava/util/HashSet;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 170
    .local p1, "commonSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    const/4 v12, 0x0

    .line 171
    .local v12, "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    const/4 v9, 0x0

    .line 172
    .local v9, "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v8, 0x0

    .line 174
    .local v8, "c":Landroid/database/Cursor;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mResolver:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 175
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .local v13, "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :try_start_1
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    .end local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .local v10, "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_0
    :try_start_2
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 178
    const-string v2, "_id"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 179
    .local v18, "rawContactID":Ljava/lang/String;
    const-string v2, "version"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 180
    .local v19, "version":Ljava/lang/String;
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v10, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .line 182
    .end local v18    # "rawContactID":Ljava/lang/String;
    .end local v19    # "version":Ljava/lang/String;
    :catch_0
    move-exception v14

    move-object v9, v10

    .end local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    move-object v12, v13

    .line 183
    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .local v14, "e":Ljava/lang/SecurityException;
    :goto_1
    :try_start_3
    const-string v2, "ContactsEventListener"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "compareAllRawContactInfo: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v14}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 184
    const/4 v13, 0x0

    .line 186
    if-eqz v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 202
    .end local v14    # "e":Ljava/lang/SecurityException;
    :cond_0
    :goto_2
    return-object v13

    .line 186
    .end local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_1
    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 189
    :cond_2
    invoke-virtual {v10}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 190
    .local v15, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_3
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 191
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 192
    .restart local v18    # "rawContactID":Ljava/lang/String;
    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    .line 193
    .local v16, "newVersion":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2VersionMaps:Ljava/util/HashMap;

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/String;

    .line 194
    .local v17, "oldVersion":Ljava/lang/String;
    if-eqz v17, :cond_4

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 195
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2ContactIDMaps:Ljava/util/HashMap;

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 196
    .local v11, "contactID":Ljava/lang/String;
    if-eqz v11, :cond_3

    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 197
    invoke-virtual {v13, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 186
    .end local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v11    # "contactID":Ljava/lang/String;
    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .end local v15    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v16    # "newVersion":Ljava/lang/String;
    .end local v17    # "oldVersion":Ljava/lang/String;
    .end local v18    # "rawContactID":Ljava/lang/String;
    .restart local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catchall_0
    move-exception v2

    :goto_4
    if-eqz v8, :cond_5

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v2

    .end local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v15    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_6
    move-object v9, v10

    .end local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    move-object v12, v13

    .line 202
    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    goto :goto_2

    .line 186
    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .end local v15    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .restart local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catchall_1
    move-exception v2

    move-object v12, v13

    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    goto :goto_4

    .end local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catchall_2
    move-exception v2

    move-object v9, v10

    .end local v10    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v9    # "compareMaps":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    move-object v12, v13

    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    goto :goto_4

    .line 182
    :catch_1
    move-exception v14

    goto/16 :goto_1

    .end local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catch_2
    move-exception v14

    move-object v12, v13

    .end local v13    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v12    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    goto/16 :goto_1
.end method

.method private convertSet2JSONArray(Ljava/util/HashSet;)Lorg/json/JSONArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    .line 109
    .local p1, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 110
    .local v1, "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 111
    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 114
    :cond_0
    return-object v1
.end method

.method private getAllContactIDs()Ljava/util/HashSet;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 118
    const/4 v6, 0x0

    .line 120
    .local v6, "c":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 121
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 122
    .local v8, "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    const-string v0, "_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 124
    .local v7, "contactID":Ljava/lang/String;
    invoke-virtual {v8, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 127
    .end local v7    # "contactID":Ljava/lang/String;
    .end local v8    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catch_0
    move-exception v9

    .line 128
    .local v9, "e":Ljava/lang/SecurityException;
    :try_start_1
    const-string v0, "ContactsEventListener"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getAllContactIDs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_0
    move-object v8, v10

    .end local v9    # "e":Ljava/lang/SecurityException;
    :cond_1
    :goto_1
    return-object v8

    .restart local v8    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_2
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .end local v8    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0
.end method

.method private getDiffSet(Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 143
    .local p1, "setA":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .local p2, "setB":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 144
    .local v0, "resultSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 145
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 146
    return-object v0
.end method

.method private getIntersectSet(Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    .local p1, "setA":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .local p2, "setB":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 137
    .local v0, "resultSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 138
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->retainAll(Ljava/util/Collection;)Z

    .line 139
    return-object v0
.end method

.method private notifyChanges(Z)V
    .locals 10
    .param p1, "bResume"    # Z

    .prologue
    .line 64
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .local v4, "jsonOutput":Lorg/json/JSONObject;
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->getAllContactIDs()Ljava/util/HashSet;

    move-result-object v2

    .line 67
    .local v2, "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    if-nez p1, :cond_0

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v7

    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v8

    if-le v7, v8, :cond_3

    .line 69
    :cond_0
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    invoke-direct {p0, v2, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->getDiffSet(Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/HashSet;

    move-result-object v0

    .line 70
    .local v0, "addedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v7

    if-lez v7, :cond_2

    .line 71
    :cond_1
    const-string v7, "added"

    invoke-direct {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->convertSet2JSONArray(Ljava/util/HashSet;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .end local v0    # "addedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_2
    :goto_0
    invoke-direct {p0, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->notifyContactChanged(Lorg/json/JSONObject;)V

    .line 89
    iput-object v2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    .line 90
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->readAllRawContactInfo()V

    .line 94
    .end local v2    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .end local v4    # "jsonOutput":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 73
    .restart local v2    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v4    # "jsonOutput":Lorg/json/JSONObject;
    :cond_3
    if-nez p1, :cond_4

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v7

    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v8

    if-ge v7, v8, :cond_6

    .line 75
    :cond_4
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    invoke-direct {p0, v7, v2}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->getDiffSet(Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/HashSet;

    move-result-object v6

    .line 76
    .local v6, "removedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    if-eqz p1, :cond_5

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v7

    if-gez v7, :cond_2

    .line 77
    :cond_5
    const-string v7, "removed"

    invoke-direct {p0, v6}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->convertSet2JSONArray(Ljava/util/HashSet;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 91
    .end local v2    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .end local v4    # "jsonOutput":Lorg/json/JSONObject;
    .end local v6    # "removedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :catch_0
    move-exception v3

    .line 92
    .local v3, "e":Lorg/json/JSONException;
    const-string v7, "ContactsEventListener"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "notifyChanges: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v3}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 81
    .end local v3    # "e":Lorg/json/JSONException;
    .restart local v2    # "contactIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .restart local v4    # "jsonOutput":Lorg/json/JSONObject;
    :cond_6
    if-eqz p1, :cond_7

    :try_start_1
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    invoke-direct {p0, v7, v2}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->getIntersectSet(Ljava/util/HashSet;Ljava/util/HashSet;)Ljava/util/HashSet;

    move-result-object v1

    .line 82
    .local v1, "commonIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :goto_2
    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->compareAllRawContactInfo(Ljava/util/HashSet;)Ljava/util/HashSet;

    move-result-object v5

    .line 83
    .local v5, "modifiedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v7

    if-eqz v7, :cond_2

    .line 84
    const-string v7, "modified"

    invoke-direct {p0, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->convertSet2JSONArray(Ljava/util/HashSet;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .end local v1    # "commonIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    .end local v5    # "modifiedIDs":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_7
    move-object v1, v2

    .line 81
    goto :goto_2
.end method

.method private notifyContactChanged(Lorg/json/JSONObject;)V
    .locals 5
    .param p1, "outObject"    # Lorg/json/JSONObject;

    .prologue
    .line 97
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 99
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 100
    .local v1, "jsonOutput":Lorg/json/JSONObject;
    const-string v2, "reply"

    const-string v3, "contactschange"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    const-string v2, "data"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContacts:Lorg/xwalk/core/internal/extension/api/contacts/Contacts;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->broadcastMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 103
    .end local v1    # "jsonOutput":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 104
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "ContactsEventListener"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notifyContactChanged: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private readAllRawContactInfo()V
    .locals 11

    .prologue
    .line 150
    const/4 v6, 0x0

    .line 152
    .local v6, "c":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2ContactIDMaps:Ljava/util/HashMap;

    .line 154
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2VersionMaps:Ljava/util/HashMap;

    .line 155
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    const-string v0, "contact_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 157
    .local v7, "contactID":Ljava/lang/String;
    const-string v0, "_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 158
    .local v9, "rawContactID":Ljava/lang/String;
    const-string v0, "version"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 159
    .local v10, "version":Ljava/lang/String;
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2ContactIDMaps:Ljava/util/HashMap;

    invoke-virtual {v0, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mRawID2VersionMaps:Ljava/util/HashMap;

    invoke-virtual {v0, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 162
    .end local v7    # "contactID":Ljava/lang/String;
    .end local v9    # "rawContactID":Ljava/lang/String;
    .end local v10    # "version":Ljava/lang/String;
    :catch_0
    move-exception v8

    .line 163
    .local v8, "e":Ljava/lang/SecurityException;
    :try_start_1
    const-string v0, "ContactsEventListener"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "readAllRawContactInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 167
    .end local v8    # "e":Ljava/lang/SecurityException;
    :cond_0
    :goto_1
    return-void

    .line 165
    :cond_1
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1
    .param p1, "selfChange"    # Z

    .prologue
    .line 45
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 46
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mIsListening:Z

    if-nez v0, :cond_0

    .line 48
    :goto_0
    return-void

    .line 47
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->notifyChanges(Z)V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 58
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mIsListening:Z

    if-nez v0, :cond_0

    .line 60
    :goto_0
    return-void

    .line 59
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->notifyChanges(Z)V

    goto :goto_0
.end method

.method protected startListening()V
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mIsListening:Z

    if-eqz v0, :cond_0

    .line 55
    :goto_0
    return-void

    .line 52
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mIsListening:Z

    .line 53
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->getAllContactIDs()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->mContactIDs:Ljava/util/HashSet;

    .line 54
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->readAllRawContactInfo()V

    goto :goto_0
.end method
