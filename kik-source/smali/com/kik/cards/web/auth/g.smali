.class final Lcom/kik/cards/web/auth/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/plugin/a;

.field final synthetic c:Lcom/kik/cards/web/auth/AuthPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/kik/cards/web/auth/g;->c:Lcom/kik/cards/web/auth/AuthPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/auth/g;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/auth/g;->b:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/kik/cards/web/auth/g;->c:Lcom/kik/cards/web/auth/AuthPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/auth/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/auth/AuthPlugin;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/auth/h;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/auth/h;-><init>(Lcom/kik/cards/web/auth/g;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 160
    return-void
.end method
