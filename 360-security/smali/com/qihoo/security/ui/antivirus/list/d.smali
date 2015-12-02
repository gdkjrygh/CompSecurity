.class public Lcom/qihoo/security/ui/antivirus/list/d;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Z

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    .line 283
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/d$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/d$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/d;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->d:Ljava/util/Comparator;

    .line 42
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->b:Z

    .line 44
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/util/List;)Lcom/qihoo/security/malware/vo/MaliciousInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x2

    .line 157
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 158
    sget-object v1, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_WARNING:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 159
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 160
    const/4 v1, 0x3

    iput v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 161
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 162
    iput v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 163
    iput-object p1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 165
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 170
    sget-object v2, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_WARNING:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 171
    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 172
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 173
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 174
    iput v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 175
    iput-object v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 177
    return-object v0
.end method

.method private a(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 264
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 265
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 266
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 267
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    packed-switch v0, :pswitch_data_0

    .line 265
    :goto_1
    :pswitch_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 273
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    const v4, 0x7f0300ab

    invoke-static {v0, v3, v4}, Lcom/qihoo/security/ui/antivirus/list/e$a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/List;I)V

    goto :goto_1

    .line 280
    :cond_0
    return-void

    .line 267
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 243
    const v0, 0x7f0300ad

    invoke-static {p1, v0}, Lcom/qihoo/security/ui/antivirus/list/e$a;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    .line 244
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 245
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 246
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 247
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    packed-switch v0, :pswitch_data_0

    .line 259
    :goto_1
    :pswitch_0
    invoke-direct {p0, v3, v1}, Lcom/qihoo/security/ui/antivirus/list/d;->a(Ljava/util/List;I)V

    .line 245
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 251
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    const v4, 0x7f0300ac

    invoke-static {v0, v3, v4}, Lcom/qihoo/security/ui/antivirus/list/e$a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/List;I)V

    goto :goto_1

    .line 254
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    const v4, 0x7f0300ab

    invoke-static {v0, v3, v4}, Lcom/qihoo/security/ui/antivirus/list/e$a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/List;I)V

    goto :goto_1

    .line 261
    :cond_0
    return-void

    .line 247
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c()Lcom/qihoo/security/malware/vo/MaliciousInfo;
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x0

    .line 186
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 188
    invoke-static {}, Lcom/qihoo/security/leak/d;->a()Lcom/qihoo/security/leak/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->c()Ljava/util/List;

    move-result-object v0

    .line 189
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/c;

    .line 190
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v3

    if-nez v3, :cond_0

    .line 191
    new-instance v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v3}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 192
    sget-object v4, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_FLAW:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v4, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 193
    iput v6, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 194
    iput v5, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 195
    iput-object v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    .line 196
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 200
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 201
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 202
    sget-object v2, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_FLAW:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 203
    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 204
    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 205
    const/4 v2, 0x2

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 206
    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 207
    iput-object v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 211
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private d()Lcom/qihoo/security/malware/vo/MaliciousInfo;
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    const/4 v0, 0x0

    .line 239
    :goto_0
    return-object v0

    .line 224
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 225
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 226
    sget-object v2, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_PROTECTION:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 227
    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 228
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 229
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 232
    sget-object v2, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_PROTECTION:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 233
    iput v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 234
    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 235
    const/4 v2, 0x2

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 236
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 237
    iput-object v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->c:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized b()V
    .locals 8

    .prologue
    .line 60
    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/list/d;->d:Ljava/util/Comparator;

    invoke-static {v0, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 69
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 71
    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 72
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 73
    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v6, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 76
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isHarmful()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 77
    iget-boolean v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    iget-object v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-boolean v6, p0, Lcom/qihoo/security/ui/antivirus/list/d;->b:Z

    if-eqz v6, :cond_0

    :cond_2
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 81
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 82
    sget-object v6, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_MALWARE:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 83
    const/4 v6, 0x3

    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 84
    const/4 v6, 0x0

    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 85
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/list/d;->a:Landroid/content/Context;

    invoke-static {v6, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 93
    sget-object v6, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_WARNING:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 94
    const/4 v6, 0x3

    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 95
    const/4 v6, 0x0

    iput v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 96
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 104
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 105
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 106
    sget-object v5, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_MALWARE:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 107
    const/4 v5, 0x1

    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 108
    const/4 v5, 0x3

    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 109
    const/4 v5, 0x2

    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 110
    const/4 v5, 0x0

    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 111
    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 112
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_5
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/d;->d()Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_6

    .line 118
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_6
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/d;->c()Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v0

    .line 123
    if-eqz v0, :cond_7

    .line 124
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 129
    new-instance v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;-><init>()V

    .line 130
    sget-object v2, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->GROUP_TYPE_ADVERT:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    iput-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    .line 131
    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->level:I

    .line 132
    const/4 v2, 0x3

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childLevel:I

    .line 133
    const/4 v2, 0x2

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    .line 134
    const/4 v2, 0x0

    iput v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->checkStatus:I

    .line 135
    iput-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->childData:Ljava/util/List;

    .line 136
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    :cond_8
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 141
    invoke-direct {p0, v4}, Lcom/qihoo/security/ui/antivirus/list/d;->a(Ljava/util/List;)Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_9

    .line 143
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    :cond_9
    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/antivirus/list/d;->b(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    monitor-exit p0

    return-void
.end method
