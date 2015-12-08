.class final Lcom/kik/cards/web/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/a/b;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/a/b;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/kik/cards/web/a/c;->a:Lcom/kik/cards/web/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/kik/cards/web/a/c;->a:Lcom/kik/cards/web/a/b;

    invoke-static {v0}, Lcom/kik/cards/web/a/b;->a(Lcom/kik/cards/web/a/b;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 33
    return-void
.end method
