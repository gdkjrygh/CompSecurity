.class Lcom/facebook/ui/images/c/c;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/facebook/ui/images/c/c;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/c;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/a;
    .locals 6

    .prologue
    .line 183
    new-instance v0, Lcom/facebook/ui/images/b/a;

    const-class v1, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {p0, v1}, Lcom/facebook/ui/images/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/images/cache/a;

    const-class v2, Lcom/facebook/ui/images/b/aa;

    invoke-virtual {p0, v2}, Lcom/facebook/ui/images/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/ui/images/b/aa;

    const-class v3, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v3}, Lcom/facebook/ui/images/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/av;

    const-class v4, Ljava/lang/String;

    const-class v5, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/ui/images/c/c;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v5}, Lcom/facebook/ui/images/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/ui/images/b/a;-><init>(Lcom/facebook/ui/images/cache/a;Lcom/facebook/ui/images/b/aa;Lcom/facebook/analytics/av;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/c;->a()Lcom/facebook/ui/images/b/a;

    move-result-object v0

    return-object v0
.end method
