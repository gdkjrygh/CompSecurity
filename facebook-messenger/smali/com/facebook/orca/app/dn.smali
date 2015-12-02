.class Lcom/facebook/orca/app/dn;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/c/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2047
    iput-object p1, p0, Lcom/facebook/orca/app/dn;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2047
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dn;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/c/a;
    .locals 4

    .prologue
    .line 2051
    new-instance v3, Lcom/facebook/orca/c/a;

    const-class v0, Lcom/facebook/appconfig/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/m;

    const-class v1, Lcom/facebook/orca/common/a/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/a/d;

    const-class v2, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/dn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/b/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/c/a;-><init>(Lcom/facebook/appconfig/m;Lcom/facebook/orca/common/a/d;Lcom/facebook/config/b/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2047
    invoke-virtual {p0}, Lcom/facebook/orca/app/dn;->a()Lcom/facebook/orca/c/a;

    move-result-object v0

    return-object v0
.end method
