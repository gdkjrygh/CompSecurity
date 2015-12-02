.class public Lcom/facebook/appconfig/c;
.super Lcom/facebook/config/background/a;
.source "AppConfigConfigurationComponent.java"


# instance fields
.field private final a:Lcom/facebook/appconfig/o;

.field private final b:Lcom/facebook/appconfig/b;


# direct methods
.method public constructor <init>(Lcom/facebook/appconfig/o;Lcom/facebook/appconfig/b;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/config/background/a;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/appconfig/c;->a:Lcom/facebook/appconfig/o;

    .line 29
    iput-object p2, p0, Lcom/facebook/appconfig/c;->b:Lcom/facebook/appconfig/b;

    .line 30
    return-void
.end method

.method static synthetic a(Lcom/facebook/appconfig/c;)Lcom/facebook/appconfig/o;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/appconfig/c;->a:Lcom/facebook/appconfig/o;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/appconfig/c;)Lcom/facebook/appconfig/b;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/appconfig/c;->b:Lcom/facebook/appconfig/b;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/v;
    .locals 2

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/appconfig/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/appconfig/e;-><init>(Lcom/facebook/appconfig/c;Lcom/facebook/appconfig/d;)V

    return-object v0
.end method
