.class public Lorg/xwalk/core/internal/extension/api/contacts/Contacts;
.super Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
.source "Contacts.java"


# static fields
.field public static final JS_API_PATH:Ljava/lang/String; = "jsapi/contacts_api.js"

.field private static final NAME:Ljava/lang/String; = "xwalk.experimental.contacts"

.field private static final TAG:Ljava/lang/String; = "Contacts"


# instance fields
.field private final mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

.field private final mResolver:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 4
    .param p1, "jsApiContent"    # Ljava/lang/String;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 39
    const-string v0, "xwalk.experimental.contacts"

    invoke-direct {p0, v0, p1, p2}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 40
    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    .line 41
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    invoke-direct {v0, v1, p0, v2}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;-><init>(Landroid/os/Handler;Lorg/xwalk/core/internal/extension/api/contacts/Contacts;Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    .line 42
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 43
    return-void
.end method

.method private handleClear()V
    .locals 10

    .prologue
    .line 102
    const/4 v6, 0x0

    .line 104
    .local v6, "c":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 105
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    const-string v0, "lookup"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 107
    .local v8, "key":Ljava/lang/String;
    sget-object v0, Landroid/provider/ContactsContract$Contacts;->CONTENT_LOOKUP_URI:Landroid/net/Uri;

    invoke-static {v0, v8}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    .line 108
    .local v9, "uri":Landroid/net/Uri;
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 110
    .end local v8    # "key":Ljava/lang/String;
    .end local v9    # "uri":Landroid/net/Uri;
    :catch_0
    move-exception v7

    .line 111
    .local v7, "e":Ljava/lang/SecurityException;
    :try_start_1
    const-string v0, "Contacts"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleClear - failed to query: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 115
    .end local v7    # "e":Ljava/lang/SecurityException;
    :cond_0
    :goto_1
    return-void

    .line 113
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
.method public onActivityStateChange(Landroid/app/Activity;I)V
    .locals 4
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "newState"    # I

    .prologue
    .line 120
    packed-switch p2, :pswitch_data_0

    .line 132
    :goto_0
    :pswitch_0
    return-void

    .line 122
    :pswitch_1
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->onResume()V

    .line 123
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    goto :goto_0

    .line 127
    :pswitch_2
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    goto :goto_0

    .line 120
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onMessage(ILjava/lang/String;)V
    .locals 13
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 53
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 98
    :goto_0
    return-void

    .line 55
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 56
    .local v4, "jsonInput":Lorg/json/JSONObject;
    const-string v10, "cmd"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 57
    .local v1, "cmd":Ljava/lang/String;
    const-string v10, "addEventListener"

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 58
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mObserver:Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;

    invoke-virtual {v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactEventListener;->startListening()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 95
    .end local v1    # "cmd":Ljava/lang/String;
    .end local v4    # "jsonInput":Lorg/json/JSONObject;
    :catch_0
    move-exception v2

    .line 96
    .local v2, "e":Lorg/json/JSONException;
    const-string v10, "Contacts"

    invoke-virtual {v2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 61
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v1    # "cmd":Ljava/lang/String;
    .restart local v4    # "jsonInput":Lorg/json/JSONObject;
    :cond_1
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 62
    .local v5, "jsonOutput":Lorg/json/JSONObject;
    const-string v10, "asyncCallId"

    const-string v11, "asyncCallId"

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v10, "save"

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 64
    new-instance v9, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;

    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    invoke-direct {v9, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;-><init>(Landroid/content/ContentResolver;)V

    .line 65
    .local v9, "saver":Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;
    const-string v10, "data"

    const-string v11, "contact"

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->save(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .end local v9    # "saver":Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;
    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0, p1, v10}, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->postMessage(ILjava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_2
    const-string v10, "find"

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 67
    new-instance v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;

    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    invoke-direct {v3, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;-><init>(Landroid/content/ContentResolver;)V

    .line 68
    .local v3, "finder":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
    const-string v10, "options"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    const-string v10, "options"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 69
    .local v7, "options":Ljava/lang/String;
    :goto_2
    invoke-virtual {v3, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->find(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 70
    .local v8, "results":Lorg/json/JSONArray;
    const-string v10, "data"

    invoke-virtual {v5, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 68
    .end local v7    # "options":Ljava/lang/String;
    .end local v8    # "results":Lorg/json/JSONArray;
    :cond_3
    const/4 v7, 0x0

    goto :goto_2

    .line 71
    .end local v3    # "finder":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
    :cond_4
    const-string v10, "remove"

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 72
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .local v6, "ops":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;"
    const/4 v10, 0x1

    new-array v0, v10, [Ljava/lang/String;

    const/4 v10, 0x0

    const-string v11, "contactId"

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v0, v10

    .line 74
    .local v0, "args":[Ljava/lang/String;
    sget-object v10, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v10}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v10

    const-string v11, "contact_id=?"

    invoke-virtual {v10, v11, v0}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    :try_start_2
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->mResolver:Landroid/content/ContentResolver;

    const-string v11, "com.android.contacts"

    invoke-virtual {v10, v11, v6}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 78
    :catch_1
    move-exception v2

    .line 79
    .local v2, "e":Ljava/lang/Exception;
    :try_start_3
    instance-of v10, v2, Landroid/os/RemoteException;

    if-nez v10, :cond_5

    instance-of v10, v2, Landroid/content/OperationApplicationException;

    if-nez v10, :cond_5

    instance-of v10, v2, Ljava/lang/SecurityException;

    if-eqz v10, :cond_6

    .line 82
    :cond_5
    const-string v10, "Contacts"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "onMessage - Failed to apply batch: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 85
    :cond_6
    new-instance v10, Ljava/lang/RuntimeException;

    invoke-direct {v10, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v10

    .line 88
    .end local v0    # "args":[Ljava/lang/String;
    .end local v2    # "e":Ljava/lang/Exception;
    .end local v6    # "ops":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;"
    :cond_7
    const-string v10, "clear"

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 89
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;->handleClear()V

    goto/16 :goto_1

    .line 91
    :cond_8
    const-string v10, "Contacts"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Unexpected message received: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0
.end method

.method public onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 48
    const/4 v0, 0x0

    return-object v0
.end method
