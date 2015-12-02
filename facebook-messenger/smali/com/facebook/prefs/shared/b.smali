.class public Lcom/facebook/prefs/shared/b;
.super Ljava/lang/Object;
.source "FbPreferenceHelper.java"


# instance fields
.field private final a:Landroid/preference/Preference;

.field private final b:Landroid/content/SharedPreferences;

.field private final c:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Landroid/preference/Preference;Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    .line 95
    new-instance v0, Lcom/facebook/prefs/shared/c;

    invoke-direct {v0, p2}, Lcom/facebook/prefs/shared/c;-><init>(Lcom/facebook/prefs/shared/d;)V

    iput-object v0, p0, Lcom/facebook/prefs/shared/b;->b:Landroid/content/SharedPreferences;

    .line 96
    iput-object p2, p0, Lcom/facebook/prefs/shared/b;->c:Lcom/facebook/prefs/shared/d;

    .line 97
    return-void
.end method


# virtual methods
.method public a()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->b:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->c:Lcom/facebook/prefs/shared/d;

    new-instance v1, Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    invoke-virtual {v2}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/prefs/shared/ae;)V
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    invoke-virtual {p1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setKey(Ljava/lang/String;)V

    .line 105
    return-void
.end method

.method public a(Z)Z
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->c:Lcom/facebook/prefs/shared/d;

    new-instance v1, Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    invoke-virtual {v2}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 131
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 133
    new-instance v1, Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    invoke-virtual {v2}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 134
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 136
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public b(Z)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 115
    if-nez p1, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/b;->a(Z)Z

    move-result v0

    if-eq p1, v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/prefs/shared/b;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 117
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    iget-object v3, p0, Lcom/facebook/prefs/shared/b;->a:Landroid/preference/Preference;

    invoke-virtual {v3}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 118
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 120
    :cond_0
    return v1

    .line 115
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
