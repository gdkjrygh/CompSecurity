.class public final Lkik/android/b/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/userdata/e;


# static fields
.field private static e:J


# instance fields
.field private a:Lcom/kik/cards/web/CardsWebViewFragment;

.field private b:Lkik/android/b/s;

.field private c:Lcom/kik/cards/web/av;

.field private d:Lkik/a/d/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 35
    const-wide/16 v0, 0x0

    sput-wide v0, Lkik/android/b/m;->e:J

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/android/b/s;Lcom/kik/cards/web/av;Lkik/a/d/aa;)V
    .locals 2

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    .line 41
    iput-object p2, p0, Lkik/android/b/m;->b:Lkik/android/b/s;

    .line 42
    iput-object p3, p0, Lkik/android/b/m;->c:Lcom/kik/cards/web/av;

    .line 43
    iput-object p4, p0, Lkik/android/b/m;->d:Lkik/a/d/aa;

    .line 44
    const-wide/16 v0, 0x0

    sput-wide v0, Lkik/android/b/m;->e:J

    .line 45
    return-void
.end method

.method static synthetic a(J)J
    .locals 0

    .prologue
    .line 26
    sput-wide p0, Lkik/android/b/m;->e:J

    return-wide p0
.end method

.method static synthetic a(Lkik/android/b/m;)Lkik/a/d/aa;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/b/m;->d:Lkik/a/d/aa;

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 297
    if-nez p0, :cond_1

    .line 303
    :cond_0
    :goto_0
    return v0

    .line 300
    :cond_1
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 301
    goto :goto_0

    .line 303
    :cond_2
    invoke-static {p0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p0}, Lcom/kik/cards/util/b;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/b/m;)Lcom/kik/cards/web/CardsWebViewFragment;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    return-object v0
.end method

.method static synthetic c(Lkik/android/b/m;)Lkik/android/b/s;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/b/m;->b:Lkik/android/b/s;

    return-object v0
.end method

.method static synthetic d(Lkik/android/b/m;)Lcom/kik/cards/web/av;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/b/m;->c:Lcom/kik/cards/web/av;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 309
    iget-object v0, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->g()Ljava/lang/String;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lkik/android/b/m;->b:Lkik/android/b/s;

    invoke-virtual {v1, v0}, Lkik/android/b/s;->e(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(IILjava/util/List;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 194
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 195
    new-instance v1, Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    .line 196
    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->c(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Z)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    iget-object v3, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v3}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v3

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 202
    iget-object v2, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v2, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v1

    .line 203
    new-instance v2, Lkik/android/b/q;

    invoke-direct {v2, p0, p3, v0}, Lkik/android/b/q;-><init>(Lkik/android/b/m;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 239
    return-object v0
.end method

.method public final a(IILjava/util/List;ZLjava/util/List;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 245
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 247
    new-instance v1, Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    .line 248
    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->c(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    invoke-virtual {v2, p4}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Z)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v2

    iget-object v3, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v3}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v3

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 255
    iget-object v2, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v2, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v1

    .line 256
    new-instance v2, Lkik/android/b/r;

    invoke-direct {v2, p0, p3, v0}, Lkik/android/b/r;-><init>(Lkik/android/b/m;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 292
    return-object v0
.end method

.method public final a(ZZLjava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 85
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 88
    if-nez p1, :cond_0

    .line 89
    invoke-virtual {v1}, Lcom/kik/g/p;->e()V

    move-object v0, v1

    .line 188
    :goto_0
    return-object v0

    .line 97
    :cond_0
    invoke-static {p3}, Lkik/android/b/m;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 98
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    .line 104
    :goto_1
    iget-object v2, p0, Lkik/android/b/m;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2, v0}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 106
    new-instance v2, Lkik/android/b/n;

    invoke-direct {v2, p0, v1, p3}, Lkik/android/b/n;-><init>(Lkik/android/b/m;Lcom/kik/g/p;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move-object v0, v1

    .line 188
    goto :goto_0

    .line 101
    :cond_1
    iget-object v0, p0, Lkik/android/b/m;->b:Lkik/android/b/s;

    invoke-virtual {v0, p3}, Lkik/android/b/s;->e(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1
.end method

.method public final a(ZLjava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 50
    .line 54
    invoke-static {p2}, Lkik/android/b/m;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    move v0, v2

    .line 76
    :goto_0
    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v6, Lkik/android/b/m;->e:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xbb8

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    .line 79
    :goto_1
    return v1

    .line 59
    :cond_0
    iget-object v0, p0, Lkik/android/b/m;->b:Lkik/android/b/s;

    invoke-virtual {v0, p2}, Lkik/android/b/s;->e(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 62
    const-wide/16 v4, 0x32

    :try_start_0
    invoke-static {v0, v4, v5}, Lcom/kik/g/s;->b(Lcom/kik/g/p;J)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :goto_2
    invoke-virtual {v0}, Lcom/kik/g/p;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 69
    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 70
    if-eqz v0, :cond_3

    .line 72
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    .line 79
    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_0
.end method
