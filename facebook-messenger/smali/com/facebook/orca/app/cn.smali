.class Lcom/facebook/orca/app/cn;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2039
    iput-object p1, p0, Lcom/facebook/orca/app/cn;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2039
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cn;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 2042
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/cn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 2043
    sget-object v1, Lcom/facebook/auth/e/a;->u:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2039
    invoke-virtual {p0}, Lcom/facebook/orca/app/cn;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
