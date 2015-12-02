.class public Lcom/qihoo/security/clearengine/sdk/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/text/NumberFormat;

.field public static b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 41
    const-class v0, Lcom/qihoo/security/clearengine/sdk/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/c;->c:Ljava/lang/String;

    .line 45
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/c;->a:Ljava/text/NumberFormat;

    .line 46
    sget-object v0, Lcom/qihoo/security/clearengine/sdk/c;->a:Ljava/text/NumberFormat;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 68
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/c$1;

    invoke-direct {v0}, Lcom/qihoo/security/clearengine/sdk/c$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/c;->b:Ljava/util/Comparator;

    .line 83
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 383
    .line 386
    const/16 v0, 0x80

    :try_start_0
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 387
    if-eqz v0, :cond_1

    .line 388
    invoke-virtual {v0, p1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    move-object v0, p0

    .line 393
    :goto_0
    if-nez v0, :cond_0

    .line 394
    const-string/jumbo v0, ""

    .line 396
    :cond_0
    return-object v0

    .line 389
    :catch_0
    move-exception v0

    move-object v0, p0

    goto :goto_0

    :cond_1
    move-object v0, p0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Landroid/content/ServiceConnection;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 93
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 94
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0, p3, p4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V
    .locals 20

    .prologue
    .line 169
    if-eqz p0, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    if-nez v2, :cond_1

    .line 237
    :cond_0
    :goto_0
    return-void

    .line 173
    :cond_1
    const-wide/16 v10, 0x0

    .line 174
    const-wide/16 v8, 0x0

    .line 176
    const-wide/16 v6, 0x0

    .line 177
    const-wide/16 v4, 0x0

    .line 179
    const-wide/16 v2, 0x0

    .line 181
    new-instance v12, Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 182
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move-wide v12, v10

    move-wide v10, v8

    move-wide v8, v6

    move-wide v6, v4

    move-wide v4, v2

    :cond_2
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 227
    move-object/from16 v0, p0

    iput-wide v12, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    .line 228
    move-object/from16 v0, p0

    iput-wide v10, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    .line 229
    move-object/from16 v0, p0

    iput-wide v8, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    .line 230
    move-object/from16 v0, p0

    iput-wide v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    .line 232
    const-wide/16 v2, 0x0

    cmp-long v2, v12, v2

    if-lez v2, :cond_8

    cmp-long v2, v4, v12

    if-nez v2, :cond_8

    .line 233
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    goto :goto_0

    .line 182
    :cond_3
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 183
    if-eqz v2, :cond_2

    .line 186
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v15, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v15}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-virtual {v3, v15}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 187
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v15, "subList"

    invoke-virtual {v3, v15}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 188
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-lez v15, :cond_7

    .line 190
    invoke-static {v2}, Lcom/qihoo/security/clearengine/sdk/c;->c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/clearengine/sdk/b;

    move-result-object v15

    .line 191
    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    move-wide/from16 v16, v0

    add-long v8, v8, v16

    .line 192
    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    move-wide/from16 v16, v0

    add-long v4, v4, v16

    .line 193
    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    move-wide/from16 v16, v0

    add-long v6, v6, v16

    .line 195
    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    iput-wide v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    .line 196
    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    iput-wide v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 198
    const/16 v16, 0x141

    iget v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_4

    .line 199
    const/16 v16, 0x142

    iget v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_4

    .line 200
    const/16 v16, 0x21

    iget v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_5

    .line 202
    :cond_4
    iget-object v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    move-object/from16 v16, v0

    .line 203
    const-string/jumbo v17, "cautiousClearCount"

    iget v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    move/from16 v18, v0

    invoke-virtual/range {v16 .. v18}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 206
    iget-wide v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    move-wide/from16 v16, v0

    const-wide/16 v18, 0x0

    cmp-long v16, v16, v18

    if-lez v16, :cond_6

    iget-wide v0, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    move-wide/from16 v16, v0

    iget-wide v0, v15, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    move-wide/from16 v18, v0

    cmp-long v15, v16, v18

    if-nez v15, :cond_6

    .line 207
    const/4 v15, 0x1

    iput-boolean v15, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 213
    :cond_5
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    int-to-long v0, v3

    move-wide/from16 v16, v0

    add-long v12, v12, v16

    .line 224
    :goto_3
    iget-wide v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v10

    move-wide v10, v2

    goto/16 :goto_1

    .line 209
    :cond_6
    const/4 v15, 0x0

    iput-boolean v15, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto :goto_2

    .line 216
    :cond_7
    invoke-static {v2}, Lcom/qihoo/security/clearengine/sdk/c;->d(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/clearengine/sdk/b;

    move-result-object v3

    .line 217
    iget-wide v0, v3, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    move-wide/from16 v16, v0

    add-long v8, v8, v16

    .line 218
    iget-wide v0, v3, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    move-wide/from16 v16, v0

    add-long v4, v4, v16

    .line 219
    iget-wide v0, v3, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    move-wide/from16 v16, v0

    add-long v6, v6, v16

    .line 221
    const-wide/16 v16, 0x1

    add-long v12, v12, v16

    goto :goto_3

    .line 235
    :cond_8
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    goto/16 :goto_0
.end method

.method public static a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 2

    .prologue
    .line 123
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 124
    return-void

    .line 123
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 2

    .prologue
    .line 101
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :goto_0
    return-void

    .line 102
    :catch_0
    move-exception v0

    .line 103
    const-string/jumbo v1, "unbindService"

    invoke-static {p0, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 108
    if-nez p0, :cond_0

    .line 120
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 119
    sget-object v0, Lcom/qihoo/security/clearengine/sdk/c;->b:Ljava/util/Comparator;

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 111
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 112
    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 114
    if-eqz v0, :cond_1

    .line 115
    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    goto :goto_1
.end method

.method public static b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;
    .locals 4

    .prologue
    .line 140
    new-instance v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;-><init>()V

    .line 143
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    .line 150
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    .line 151
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->flag:I

    .line 152
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->packageName:Ljava/lang/String;

    .line 154
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const-string/jumbo v0, ""

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->packageName:Ljava/lang/String;

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "pkgList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 157
    if-eqz v0, :cond_1

    .line 158
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 159
    const-string/jumbo v3, "pkgList"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 160
    iput-object v2, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->bundle:Landroid/os/Bundle;

    .line 162
    :cond_1
    return-object v1

    .line 151
    :cond_2
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static final c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/clearengine/sdk/b;
    .locals 8

    .prologue
    .line 240
    new-instance v1, Lcom/qihoo/security/clearengine/sdk/b;

    invoke-direct {v1}, Lcom/qihoo/security/clearengine/sdk/b;-><init>()V

    .line 241
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 242
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 243
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 264
    return-object v1

    .line 243
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 244
    if-eqz v0, :cond_0

    .line 248
    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->d(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/clearengine/sdk/b;

    move-result-object v3

    .line 251
    iget v4, v3, Lcom/qihoo/security/clearengine/sdk/b;->e:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Lcom/qihoo/security/clearengine/sdk/b;->e:I

    .line 252
    const/4 v4, 0x1

    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-ne v4, v0, :cond_2

    .line 253
    iget v0, v3, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v3, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    .line 256
    :cond_2
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    iget-wide v6, v3, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    .line 257
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    iget-wide v6, v3, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    .line 258
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    iget-wide v6, v3, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    .line 259
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    iget-wide v6, v3, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    .line 260
    iget v0, v1, Lcom/qihoo/security/clearengine/sdk/b;->e:I

    iget v4, v3, Lcom/qihoo/security/clearengine/sdk/b;->e:I

    add-int/2addr v0, v4

    iput v0, v1, Lcom/qihoo/security/clearengine/sdk/b;->e:I

    .line 261
    iget v0, v1, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    iget v4, v3, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    add-int/2addr v0, v4

    iput v0, v1, Lcom/qihoo/security/clearengine/sdk/b;->f:I

    .line 262
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    iget-wide v6, v3, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    goto :goto_0
.end method

.method private static final d(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/clearengine/sdk/b;
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 268
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/b;

    invoke-direct {v0}, Lcom/qihoo/security/clearengine/sdk/b;-><init>()V

    .line 269
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v1, :cond_0

    .line 270
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    add-long/2addr v2, v6

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->g:J

    .line 271
    const/16 v1, 0x1f

    iget v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-ne v1, v2, :cond_1

    .line 272
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    add-long/2addr v2, v6

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    .line 273
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    .line 281
    :cond_0
    :goto_0
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    add-long/2addr v2, v6

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    .line 282
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    .line 284
    return-object v0

    .line 275
    :cond_1
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v1, :cond_0

    .line 276
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    add-long/2addr v2, v6

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    .line 277
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    goto :goto_0
.end method
