.class public final Lcom/facebook/prefs/shared/q;
.super Lcom/facebook/inject/d;
.source "FbSharedPreferencesImplAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/prefs/shared/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/prefs/shared/j;
    .locals 7

    .prologue
    .line 13
    new-instance v0, Lcom/facebook/prefs/shared/j;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Landroid/content/ContentResolver;

    invoke-virtual {p0, v2}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ContentResolver;

    const-class v3, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v3}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/executors/a;

    const-class v4, Landroid/content/SharedPreferences;

    const-class v5, Lcom/facebook/prefs/shared/DefaultSharedPreferences;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/SharedPreferences;

    const-class v5, Lcom/facebook/prefs/shared/h;

    invoke-virtual {p0, v5}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/h;

    const-class v6, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v6}, Lcom/facebook/prefs/shared/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/prefs/shared/j;-><init>(Landroid/content/Context;Landroid/content/ContentResolver;Lcom/facebook/common/executors/a;Landroid/content/SharedPreferences;Lcom/facebook/prefs/shared/h;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/q;->a()Lcom/facebook/prefs/shared/j;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 25
    instance-of v0, p1, Lcom/facebook/prefs/shared/q;

    return v0
.end method
