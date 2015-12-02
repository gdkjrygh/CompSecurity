.class Lcom/facebook/maps/w;
.super Lcom/facebook/inject/d;
.source "MapsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/maps/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/maps/s;


# direct methods
.method private constructor <init>(Lcom/facebook/maps/s;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/maps/w;->a:Lcom/facebook/maps/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/maps/s;Lcom/facebook/maps/t;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/maps/w;-><init>(Lcom/facebook/maps/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/maps/q;
    .locals 2

    .prologue
    .line 49
    new-instance v1, Lcom/facebook/maps/q;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/maps/q;-><init>(Landroid/util/DisplayMetrics;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/maps/w;->a()Lcom/facebook/maps/q;

    move-result-object v0

    return-object v0
.end method
