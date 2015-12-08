.class public final Lkik/a/d/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Boolean;

.field public h:Ljava/lang/Boolean;

.field public i:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lkik/a/e/v;)Lkik/a/d/aa;
    .locals 4

    .prologue
    .line 64
    new-instance v1, Lkik/a/d/aa;

    invoke-direct {v1}, Lkik/a/d/aa;-><init>()V

    .line 65
    const-string v0, "user_profile_email"

    invoke-interface {p0, v0}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/lang/Boolean;

    const-string v2, "true"

    const-string v3, "user_profile_email_emailConfirmed"

    invoke-interface {p0, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v0, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v0, v1, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    .line 67
    const-string v0, "user_profile_username"

    invoke-interface {p0, v0}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 68
    const-string v0, "user_profile_firstName"

    invoke-interface {p0, v0}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkik/a/d/aa;->d:Ljava/lang/String;

    .line 69
    const-string v0, "user_profile_lastName"

    invoke-interface {p0, v0}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkik/a/d/aa;->e:Ljava/lang/String;

    .line 70
    const-string v0, "user_profile_photoUrl"

    invoke-interface {p0, v0}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkik/a/d/aa;->f:Ljava/lang/String;

    .line 71
    new-instance v0, Ljava/lang/Boolean;

    const-string v2, "true"

    const-string v3, "user_profile_is_updated"

    invoke-interface {p0, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v0, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v0, v1, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    .line 72
    new-instance v2, Ljava/lang/Boolean;

    const-string v0, "false"

    const-string v3, "notify_new_people"

    invoke-interface {p0, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {v2, v0}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v2, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    .line 73
    new-instance v0, Ljava/lang/Boolean;

    const-string v2, "true"

    const-string v3, "user_profile_verified"

    invoke-interface {p0, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v0, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v0, v1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    .line 75
    return-object v1

    .line 72
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 31
    if-ne p0, p1, :cond_1

    .line 49
    :cond_0
    :goto_0
    return v0

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 36
    goto :goto_0

    .line 39
    :cond_3
    check-cast p1, Lkik/a/d/aa;

    .line 40
    iget-object v2, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 41
    iget-object v2, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    .line 49
    goto :goto_0

    .line 45
    :cond_5
    iget-object v2, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    iget-object v3, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 25
    return v0

    .line 22
    :cond_0
    iget-object v0, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method
