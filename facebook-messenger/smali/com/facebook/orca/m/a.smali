.class public Lcom/facebook/orca/m/a;
.super Ljava/lang/Object;
.source "TitlebarProgressProgressIndicator.java"

# interfaces
.implements Lcom/facebook/fbservice/ops/ab;


# instance fields
.field private final a:Lcom/facebook/widget/titlebar/a;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/titlebar/a;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/orca/m/a;->a:Lcom/facebook/widget/titlebar/a;

    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/m/a;->a:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->a(Z)V

    .line 22
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/m/a;->a:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->a(Z)V

    .line 27
    return-void
.end method
