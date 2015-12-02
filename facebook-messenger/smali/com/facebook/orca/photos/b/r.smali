.class Lcom/facebook/orca/photos/b/r;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/photos/b/r;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 128
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/r;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/a;
    .locals 2

    .prologue
    .line 133
    new-instance v1, Lcom/facebook/orca/photos/b/a;

    const-class v0, Lcom/facebook/abtest/qe/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    invoke-direct {v1, v0}, Lcom/facebook/orca/photos/b/a;-><init>(Lcom/facebook/abtest/qe/d/e;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/r;->a()Lcom/facebook/orca/photos/b/a;

    move-result-object v0

    return-object v0
.end method
