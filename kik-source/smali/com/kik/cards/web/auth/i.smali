.class final Lcom/kik/cards/web/auth/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/plugin/a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/kik/cards/web/auth/AuthPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/auth/i;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/auth/i;->b:Lcom/kik/cards/web/plugin/a;

    iput-object p4, p0, Lcom/kik/cards/web/auth/i;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 186
    iget-object v0, p0, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/auth/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/auth/AuthPlugin;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/auth/AuthPlugin;->a(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/android/b/s;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/auth/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lkik/android/b/s;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/g/s;->c(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/auth/j;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/auth/j;-><init>(Lcom/kik/cards/web/auth/i;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 242
    return-void
.end method
