.class public Lcom/facebook/debug/log/a;
.super Lcom/facebook/inject/c;
.source "AppLoggingModule.java"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/facebook/debug/log/a;->a:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .prologue
    .line 20
    const-class v0, Lcom/facebook/debug/log/h;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/log/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 21
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/log/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/log/AppLoggingPrefix;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/debug/log/a;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 24
    return-void
.end method
