.class public Lcom/crittercism/app/CritterUserData;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/Map;

.field private final b:Z


# direct methods
.method constructor <init>(Ljava/util/Map;Z)V
    .locals 0
    .param p2, "isOptedOut"    # Z

    .prologue
    .line 13
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    .line 15
    iput-boolean p2, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    .line 16
    return-void
.end method


# virtual methods
.method public crashedOnLastLoad()Z
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "crashedOnLastLoad"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 106
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "Crittercism"

    const-string v1, "User has opted out of Crittercism.  Returning false."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_0
    const/4 v0, 0x0

    .line 113
    :goto_1
    return v0

    .line 109
    :cond_0
    const-string v0, "Crittercism"

    const-string v1, "CritterUserData instance has no value for crashedOnLastLoad().  Defaulting to false."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "crashedOnLastLoad"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1
.end method

.method public getRateMyAppMessage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "message"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    if-eqz v0, :cond_1

    .line 75
    const-string v0, "Crittercism"

    const-string v1, "User has opted out of Crittercism.  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "message"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 77
    :cond_1
    const-string v0, "Crittercism"

    const-string v1, "CritterUserData instance has no value for getRateMyAppMessage().  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getRateMyAppTitle()Ljava/lang/String;
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "title"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    if-eqz v0, :cond_1

    .line 54
    const-string v0, "Crittercism"

    const-string v1, "User has opted out of Crittercism.  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "title"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 56
    :cond_1
    const-string v0, "Crittercism"

    const-string v1, "CritterUserData instance has no value for getRateMyAppTitle().  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getUserUUID()Ljava/lang/String;
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "userUUID"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    if-eqz v0, :cond_1

    .line 125
    const-string v0, "Crittercism"

    const-string v1, "User has opted out of Crittercism.  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "userUUID"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 127
    :cond_1
    const-string v0, "Crittercism"

    const-string v1, "CritterUserData instance has no value for getUserUUID().  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public isOptedOut()Z
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "optOutStatus"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    .line 93
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "optOutStatus"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public shouldShowRateMyAppAlert()Z
    .locals 2

    .prologue
    .line 30
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "shouldShowRateAppAlert"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 31
    iget-boolean v0, p0, Lcom/crittercism/app/CritterUserData;->b:Z

    if-eqz v0, :cond_0

    .line 32
    const-string v0, "Crittercism"

    const-string v1, "User has opted out of Crittercism.  Returning false."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    :goto_0
    const/4 v0, 0x0

    .line 38
    :goto_1
    return v0

    .line 34
    :cond_0
    const-string v0, "Crittercism"

    const-string v1, "CritterUserData instance has no value for shouldShowMyRateAppAlert().  Defaulting to false."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/crittercism/app/CritterUserData;->a:Ljava/util/Map;

    const-string v1, "shouldShowRateAppAlert"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1
.end method
