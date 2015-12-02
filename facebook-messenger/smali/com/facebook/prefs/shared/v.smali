.class Lcom/facebook/prefs/shared/v;
.super Lcom/facebook/inject/d;
.source "FbSharedPreferencesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/t;


# direct methods
.method private constructor <init>(Lcom/facebook/prefs/shared/t;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/prefs/shared/v;->a:Lcom/facebook/prefs/shared/t;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/prefs/shared/t;Lcom/facebook/prefs/shared/u;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/v;-><init>(Lcom/facebook/prefs/shared/t;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/SharedPreferences;
    .locals 4

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/v;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 86
    new-instance v2, Lcom/facebook/prefs/shared/a;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/a;-><init>(Landroid/content/Context;)V

    .line 87
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/d;

    .line 92
    invoke-interface {v0}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lcom/facebook/common/process/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    const/4 v0, 0x0

    .line 105
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/facebook/prefs/shared/v;->a:Lcom/facebook/prefs/shared/t;

    invoke-static {v1}, Lcom/facebook/prefs/shared/t;->a(Lcom/facebook/prefs/shared/t;)Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "_"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 110
    :goto_1
    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/facebook/prefs/shared/a;->a(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    .line 99
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/common/process/c;->c()Ljava/lang/String;

    move-result-object v0

    .line 100
    if-nez v0, :cond_0

    .line 101
    invoke-virtual {v1}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
