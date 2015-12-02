.class public Lcom/facebook/http/protocol/ak;
.super Ljava/lang/Object;
.source "IsWirehogProfilingEnabledProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/http/protocol/ak;->a:Lcom/facebook/prefs/shared/d;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/http/protocol/ak;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/http/f/c;->c:Lcom/facebook/prefs/shared/ae;

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
    .line 14
    invoke-virtual {p0}, Lcom/facebook/http/protocol/ak;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
