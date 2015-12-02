.class Lcom/facebook/orca/app/cm;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/p/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2069
    iput-object p1, p0, Lcom/facebook/orca/app/cm;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2069
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cm;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/p/h;
    .locals 2

    .prologue
    .line 2073
    new-instance v0, Lcom/facebook/orca/p/h;

    const-class v1, Ljava/util/Locale;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cm;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/p/h;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2069
    invoke-virtual {p0}, Lcom/facebook/orca/app/cm;->a()Lcom/facebook/orca/p/h;

    move-result-object v0

    return-object v0
.end method
