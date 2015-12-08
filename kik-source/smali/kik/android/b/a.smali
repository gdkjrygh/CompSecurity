.class public final Lkik/android/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/b/a$1;,
        Lkik/android/b/a$a;
    }
.end annotation


# instance fields
.field private final a:Lkik/a/j/m;

.field private final b:Lkik/a/e/v;

.field private final c:Lkik/a/i/h;

.field private final d:Lkik/android/b/s;

.field private final e:Lcom/kik/g/as;

.field private final f:Lcom/kik/g/as;


# direct methods
.method public constructor <init>(Lkik/a/j/m;Lkik/a/e/v;Lkik/a/i/h;)V
    .locals 2

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lkik/android/b/b;

    invoke-direct {v0, p0}, Lkik/android/b/b;-><init>(Lkik/android/b/a;)V

    iput-object v0, p0, Lkik/android/b/a;->e:Lcom/kik/g/as;

    .line 51
    new-instance v0, Lkik/android/b/c;

    invoke-direct {v0, p0}, Lkik/android/b/c;-><init>(Lkik/android/b/a;)V

    iput-object v0, p0, Lkik/android/b/a;->f:Lcom/kik/g/as;

    .line 70
    iput-object p1, p0, Lkik/android/b/a;->a:Lkik/a/j/m;

    .line 71
    iput-object p2, p0, Lkik/android/b/a;->b:Lkik/a/e/v;

    .line 72
    iput-object p3, p0, Lkik/android/b/a;->c:Lkik/a/i/h;

    .line 73
    new-instance v0, Lkik/android/b/s;

    iget-object v1, p0, Lkik/android/b/a;->a:Lkik/a/j/m;

    invoke-direct {v0, v1}, Lkik/android/b/s;-><init>(Lkik/a/j/n;)V

    iput-object v0, p0, Lkik/android/b/a;->d:Lkik/android/b/s;

    .line 74
    return-void
.end method

.method static synthetic a(Lkik/android/b/a;)Lkik/android/b/s;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/android/b/a;->d:Lkik/android/b/s;

    return-object v0
.end method

.method protected static a(Lkik/a/i/h$a;)[B
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 242
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/i/h$a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 253
    :cond_0
    :goto_0
    return-object v0

    .line 245
    :cond_1
    :try_start_0
    const-string v1, "SHA-1"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 253
    invoke-virtual {p0}, Lkik/a/i/h$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    goto :goto_0

    .line 251
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/b/a;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/android/b/a;->b:Lkik/a/e/v;

    return-object v0
.end method

.method private b()Z
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lkik/android/b/a;->b:Lkik/a/e/v;

    const-string v1, "XDATA_CARD_HISTORY_MIGRATED"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lkik/android/b/a;)Lkik/a/i/h;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/android/b/a;->c:Lkik/a/i/h;

    return-object v0
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lkik/android/b/a;->b:Lkik/a/e/v;

    const-string v1, "XDATA_CARD_PERMISSIONS_MIGRATED"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 79
    invoke-direct {p0}, Lkik/android/b/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkik/android/b/a;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    :cond_0
    iget-object v0, p0, Lkik/android/b/a;->a:Lkik/a/j/m;

    const-string v1, "enc_card_list"

    const-class v2, Lcom/kik/n/a/c/e;

    invoke-interface {v0, v1, v2}, Lkik/a/j/m;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    .line 81
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    invoke-direct {p0}, Lkik/android/b/a;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 82
    :goto_0
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    invoke-direct {p0}, Lkik/android/b/a;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 84
    :cond_1
    :goto_1
    return-void

    .line 81
    :cond_2
    iget-object v2, p0, Lkik/android/b/a;->e:Lcom/kik/g/as;

    invoke-static {v2}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v2

    iget-object v3, p0, Lkik/android/b/a;->a:Lkik/a/j/m;

    const-string v4, "enc_card_pinned"

    const-class v5, Lcom/kik/n/a/c/i;

    invoke-interface {v3, v4, v5}, Lkik/a/j/m;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v3

    new-instance v4, Lkik/android/b/e;

    invoke-direct {v4, p0, v3, v1}, Lkik/android/b/e;-><init>(Lkik/android/b/a;Lcom/kik/g/p;Lcom/kik/g/p;)V

    invoke-virtual {v2, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 82
    :cond_3
    iget-object v2, p0, Lkik/android/b/a;->f:Lcom/kik/g/as;

    invoke-static {v2}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/android/b/d;

    invoke-direct {v2, p0, v1}, Lkik/android/b/d;-><init>(Lkik/android/b/a;Lcom/kik/g/p;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method
