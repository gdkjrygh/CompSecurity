.class public final Lkik/a/g/az;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/w;
.implements Lkik/a/f/j;


# instance fields
.field private final a:Lcom/kik/g/f;

.field private final b:Lcom/kik/g/i;

.field private c:Lkik/a/d/aa;

.field private d:Lkik/a/e/f;

.field private e:Lkik/a/e/v;

.field private f:Lcom/kik/g/k;

.field private g:Lcom/kik/g/k;

.field private h:Lcom/kik/g/k;

.field private i:Lcom/kik/g/p;


# direct methods
.method public constructor <init>(Lkik/a/e/v;Lkik/a/e/f;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/g/az;->a:Lcom/kik/g/f;

    .line 29
    new-instance v0, Lkik/a/g/ba;

    invoke-direct {v0, p0}, Lkik/a/g/ba;-><init>(Lkik/a/g/az;)V

    iput-object v0, p0, Lkik/a/g/az;->b:Lcom/kik/g/i;

    .line 45
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/a/g/az;->i:Lcom/kik/g/p;

    .line 49
    iput-object p1, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    .line 50
    iput-object p2, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    .line 51
    return-void
.end method

.method static synthetic a(Lkik/a/g/az;)V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    invoke-virtual {v0}, Lkik/a/d/aa;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ao;

    invoke-direct {v1, p0}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    :cond_0
    return-void
.end method

.method static synthetic b(Lkik/a/g/az;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic c(Lkik/a/g/az;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/g/az;->h:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/a/g/az;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 172
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "niCRwL7isZHny24qgLvy"

    invoke-static {v0, p1, v1}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v8

    .line 174
    invoke-static {v8}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v6

    .line 176
    iget-object v9, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v0, Lkik/a/f/f/ao;

    move-object v1, p0

    move-object v3, v2

    move-object v4, p1

    move-object v5, v2

    move-object v7, v2

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/bb;

    invoke-direct {v1, p0, p1, v8}, Lkik/a/g/bb;-><init>(Lkik/a/g/az;Ljava/lang/String;[B)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 197
    iget-object v8, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v0, Lkik/a/f/f/ao;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/bc;

    invoke-direct {v1, p0, p1, p2}, Lkik/a/g/bc;-><init>(Lkik/a/g/az;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Z)Lcom/kik/g/p;
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 249
    iget-object v8, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v0, Lkik/a/f/f/ao;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v1, p0

    move-object v3, v2

    move-object v4, v2

    move-object v6, v2

    move-object v7, v2

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/be;

    invoke-direct {v1, p0, p1}, Lkik/a/g/be;-><init>(Lkik/a/g/az;Z)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .prologue
    .line 275
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/az;->f:Lcom/kik/g/k;

    .line 276
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/az;->g:Lcom/kik/g/k;

    .line 277
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/g/az;->h:Lcom/kik/g/k;

    .line 278
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/d/aa;->a(Lkik/a/e/v;)Lkik/a/d/aa;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    .line 279
    iget-object v0, p0, Lkik/a/g/az;->a:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/az;->b:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 280
    return-void
.end method

.method public final a(Lkik/a/d/aa;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 80
    iget-object v2, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    if-nez p1, :cond_1

    :goto_0
    if-eqz v0, :cond_0

    .line 81
    iget-object v1, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    iget-object v2, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    const-string v0, "user_profile_email"

    iget-object v3, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "user_profile_email_emailConfirmed"

    iget-object v0, v1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    iget-object v0, v1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "true"

    :goto_1
    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "user_profile_username"

    iget-object v3, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "user_profile_firstName"

    iget-object v3, v1, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "user_profile_lastName"

    iget-object v3, v1, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "user_profile_photoUrl"

    iget-object v3, v1, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "user_profile_is_updated"

    iget-object v0, v1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    iget-object v0, v1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "true"

    :goto_2
    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "notify_new_people"

    iget-object v0, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    if-eqz v0, :cond_c

    iget-object v0, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "true"

    :goto_3
    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "user_profile_verified"

    iget-object v0, v1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_d

    iget-object v0, v1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "true"

    :goto_4
    invoke-interface {v2, v3, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 82
    iget-object v0, p0, Lkik/a/g/az;->g:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 84
    :cond_0
    return-void

    .line 80
    :cond_1
    iget-object v3, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v3, :cond_2

    iget-object v0, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    iput-object v0, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    move v0, v1

    :cond_2
    iget-object v3, p1, Lkik/a/d/aa;->a:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v0, p1, Lkik/a/d/aa;->a:Ljava/lang/String;

    iput-object v0, v2, Lkik/a/d/aa;->a:Ljava/lang/String;

    move v0, v1

    :cond_3
    iget-object v3, p1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    iget-object v0, p1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    iput-object v0, v2, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    move v0, v1

    :cond_4
    iget-object v3, p1, Lkik/a/d/aa;->d:Ljava/lang/String;

    if-eqz v3, :cond_5

    iget-object v0, p1, Lkik/a/d/aa;->d:Ljava/lang/String;

    iput-object v0, v2, Lkik/a/d/aa;->d:Ljava/lang/String;

    move v0, v1

    :cond_5
    iget-object v3, p1, Lkik/a/d/aa;->e:Ljava/lang/String;

    if-eqz v3, :cond_6

    iget-object v0, p1, Lkik/a/d/aa;->e:Ljava/lang/String;

    iput-object v0, v2, Lkik/a/d/aa;->e:Ljava/lang/String;

    move v0, v1

    :cond_6
    iget-object v3, p1, Lkik/a/d/aa;->f:Ljava/lang/String;

    if-eqz v3, :cond_7

    iget-object v0, p1, Lkik/a/d/aa;->f:Ljava/lang/String;

    iput-object v0, v2, Lkik/a/d/aa;->f:Ljava/lang/String;

    move v0, v1

    :cond_7
    iget-object v3, p1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    if-eqz v3, :cond_8

    iget-object v0, p1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    iput-object v0, v2, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    move v0, v1

    :cond_8
    iget-object v3, p1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    if-eqz v3, :cond_9

    iget-object v0, p1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    iput-object v0, v2, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    move v0, v1

    :cond_9
    iget-object v3, p1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    if-eqz v3, :cond_e

    iget-object v0, p1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    iput-object v0, v2, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    :goto_5
    move v0, v1

    goto/16 :goto_0

    .line 81
    :cond_a
    const-string v0, "false"

    goto/16 :goto_1

    :cond_b
    const-string v0, "false"

    goto/16 :goto_2

    :cond_c
    const-string v0, "false"

    goto :goto_3

    :cond_d
    const-string v0, "false"

    goto :goto_4

    :cond_e
    move v1, v0

    goto :goto_5
.end method

.method public final a(Lkik/a/f/f/z;I)V
    .locals 1

    .prologue
    .line 143
    instance-of v0, p1, Lkik/a/f/f/ao;

    if-eqz v0, :cond_0

    .line 144
    packed-switch p2, :pswitch_data_0

    .line 151
    :cond_0
    :goto_0
    return-void

    .line 146
    :pswitch_0
    check-cast p1, Lkik/a/f/f/ao;

    .line 147
    invoke-virtual {p1}, Lkik/a/f/f/ao;->d()Lkik/a/d/aa;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/g/az;->a(Lkik/a/d/aa;)V

    goto :goto_0

    .line 144
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final a([B)V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    iget-object v1, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    invoke-interface {v0, p1, v1}, Lkik/a/e/v;->a([BLkik/a/d/aa;)V

    .line 108
    return-void
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lkik/a/g/az;->f:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 217
    invoke-virtual {p0}, Lkik/a/g/az;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 218
    :try_start_0
    const-string v1, "SHA1"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 227
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    invoke-static {v1}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v8

    .line 229
    iget-object v1, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    const-string v3, "niCRwL7isZHny24qgLvy"

    invoke-static {v8, v1, v3}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v7

    .line 230
    iget-object v0, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    const-string v1, "niCRwL7isZHny24qgLvy"

    invoke-static {v8, v0, v1}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v6

    .line 232
    iget-object v9, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v0, Lkik/a/f/f/ao;

    move-object v1, p0

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/bd;

    invoke-direct {v1, p0, v8}, Lkik/a/g/bd;-><init>(Lkik/a/g/az;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    :goto_0
    return-object v0

    .line 223
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final b([B)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    iget-object v1, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    invoke-interface {v0, p1, v1}, Lkik/a/e/v;->b([BLkik/a/d/aa;)V

    .line 114
    return-void
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lkik/a/g/az;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lkik/a/d/aa;
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    new-instance v1, Lkik/a/d/aa;

    invoke-direct {v1}, Lkik/a/d/aa;-><init>()V

    iget-object v2, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    iput-object v2, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    iget-object v2, v0, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    iput-object v2, v1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    iget-object v2, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    iput-object v2, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    iget-object v2, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    iput-object v2, v1, Lkik/a/d/aa;->d:Ljava/lang/String;

    iget-object v2, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    iput-object v2, v1, Lkik/a/d/aa;->e:Ljava/lang/String;

    iget-object v2, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    iput-object v2, v1, Lkik/a/d/aa;->f:Ljava/lang/String;

    iget-object v2, v0, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    iput-object v2, v1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    iget-object v2, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    iput-object v2, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    iget-object v0, v0, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    iput-object v0, v1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    return-object v1
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lkik/a/g/az;->f:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 269
    iget-object v0, p0, Lkik/a/g/az;->i:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 270
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ao;

    invoke-direct {v1, p0}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 90
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lkik/a/g/az;->i:Lcom/kik/g/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method public final h()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lkik/a/g/az;->i:Lcom/kik/g/p;

    return-object v0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    invoke-virtual {v0}, Lkik/a/d/aa;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ao;

    invoke-direct {v1, p0}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 290
    :cond_0
    iget-object v0, p0, Lkik/a/g/az;->a:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 291
    return-void
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lkik/a/g/az;->e:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->o()Z

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/g/az;->c:Lkik/a/d/aa;

    iget-object v0, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 164
    invoke-virtual {p0}, Lkik/a/g/az;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkik/a/g/az;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lkik/a/g/az;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ao;

    invoke-direct {v1, p0}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 167
    :cond_0
    return-void
.end method
