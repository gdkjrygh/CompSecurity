.class public Lcom/qihoo/security/ui/result/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Lcom/qihoo/security/ui/result/d;


# instance fields
.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/d;->a:Lcom/qihoo/security/ui/result/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/d;->b:Ljava/util/List;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/d;->d:Ljava/util/List;

    .line 42
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    .line 43
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/d;
    .locals 2

    .prologue
    .line 35
    const-class v1, Lcom/qihoo/security/ui/result/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/d;->a:Lcom/qihoo/security/ui/result/d;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/qihoo/security/ui/result/d;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/d;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/d;->a:Lcom/qihoo/security/ui/result/d;

    .line 38
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/d;->a:Lcom/qihoo/security/ui/result/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/d;)Ljava/util/List;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/result/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(I)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 148
    .line 149
    sparse-switch p1, :sswitch_data_0

    .line 170
    :cond_0
    :goto_0
    return v0

    .line 155
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_show_prescan"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0

    .line 158
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_show_scan"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0

    .line 164
    :sswitch_2
    iget-object v2, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v3, "sp_key_game_booster_card_clicked"

    invoke-static {v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/d;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    move v0, v1

    goto :goto_0

    .line 149
    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x6 -> :sswitch_1
        0xb -> :sswitch_2
    .end sparse-switch
.end method

.method public b()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/result/card/c$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 48
    new-instance v3, Lcom/qihoo/security/ui/result/card/c$a;

    invoke-direct {v3}, Lcom/qihoo/security/ui/result/card/c$a;-><init>()V

    .line 49
    iput-object v0, v3, Lcom/qihoo/security/ui/result/card/c$a;->g:Ljava/lang/String;

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v4, "sp_key_game_booster_card_type"

    const/4 v5, -0x1

    invoke-static {v0, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    iput v0, v3, Lcom/qihoo/security/ui/result/card/c$a;->h:I

    .line 51
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 53
    :cond_0
    return-object v1
.end method

.method public c()V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 59
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/p;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/result/d$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/d$1;-><init>(Lcom/qihoo/security/ui/result/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 81
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/opti/b/d;->b(Landroid/content/Context;)J

    move-result-wide v0

    .line 127
    iget-object v2, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "malware_scan_time"

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 136
    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    .line 137
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c00d2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 143
    :goto_0
    return-object v0

    .line 139
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 140
    const-wide/32 v2, 0xf731400

    cmp-long v2, v0, v2

    if-gez v2, :cond_1

    .line 141
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c00d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 143
    :cond_1
    const v2, 0x7f0c00d1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/32 v4, 0x5265c00

    div-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f090071

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/high16 v3, -0x10000

    invoke-static {v2, v0, v1, v3}, Lcom/qihoo360/mobilesafe/b/n;->a(ILjava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    goto :goto_0
.end method

.method public f()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/result/card/c$a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x3

    .line 176
    iget-object v1, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_prescan_count"

    const-string/jumbo v3, ""

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 177
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 200
    :cond_0
    :goto_0
    return-object v0

    .line 181
    :cond_1
    const-string/jumbo v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 182
    if-eqz v2, :cond_0

    array-length v1, v2

    if-ne v1, v5, :cond_0

    .line 186
    new-array v3, v5, [I

    fill-array-data v3, :array_0

    .line 188
    new-array v4, v5, [I

    fill-array-data v4, :array_1

    .line 190
    new-array v5, v5, [I

    fill-array-data v5, :array_2

    .line 191
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    const/4 v0, 0x0

    :goto_1
    array-length v6, v2

    if-ge v0, v6, :cond_2

    .line 193
    new-instance v6, Lcom/qihoo/security/ui/result/card/c$a;

    invoke-direct {v6}, Lcom/qihoo/security/ui/result/card/c$a;-><init>()V

    .line 194
    aget v7, v3, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->a:I

    .line 195
    aget v7, v4, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->b:I

    .line 196
    aget v7, v5, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->c:I

    .line 197
    aget-object v7, v2, v0

    iput-object v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->f:Ljava/lang/String;

    .line 198
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 200
    goto :goto_0

    .line 186
    :array_0
    .array-data 4
        0x7f0c00d9
        0x7f0c003d
        0x7f0c003e
    .end array-data

    .line 188
    :array_1
    .array-data 4
        0x7f02009c
        0x7f02009b
        0x7f020099
    .end array-data

    .line 190
    :array_2
    .array-data 4
        0x7f080009
        0x7f080007
        0x7f080008
    .end array-data
.end method

.method public g()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/result/card/c$a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x3

    .line 204
    iget-object v1, p0, Lcom/qihoo/security/ui/result/d;->c:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_scan_count"

    const-string/jumbo v3, ""

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 205
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 229
    :cond_0
    :goto_0
    return-object v0

    .line 209
    :cond_1
    const-string/jumbo v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 210
    if-eqz v2, :cond_0

    array-length v1, v2

    if-ne v1, v5, :cond_0

    .line 214
    new-array v3, v5, [I

    fill-array-data v3, :array_0

    .line 216
    new-array v4, v5, [I

    fill-array-data v4, :array_1

    .line 218
    new-array v5, v5, [I

    fill-array-data v5, :array_2

    .line 219
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 220
    const/4 v0, 0x0

    :goto_1
    array-length v6, v2

    if-ge v0, v6, :cond_2

    .line 221
    new-instance v6, Lcom/qihoo/security/ui/result/card/c$a;

    invoke-direct {v6}, Lcom/qihoo/security/ui/result/card/c$a;-><init>()V

    .line 222
    aget v7, v3, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->a:I

    .line 223
    aget v7, v4, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->b:I

    .line 224
    aget v7, v5, v0

    iput v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->c:I

    .line 225
    aget-object v7, v2, v0

    iput-object v7, v6, Lcom/qihoo/security/ui/result/card/c$a;->f:Ljava/lang/String;

    .line 226
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 229
    goto :goto_0

    .line 214
    :array_0
    .array-data 4
        0x7f0c003e
        0x7f0c00de
        0x7f0c00df
    .end array-data

    .line 216
    :array_1
    .array-data 4
        0x7f020099
        0x7f02009b
        0x7f020099
    .end array-data

    .line 218
    :array_2
    .array-data 4
        0x7f080008
        0x7f080007
        0x7f08000a
    .end array-data
.end method
