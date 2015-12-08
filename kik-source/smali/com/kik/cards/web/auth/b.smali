.class final Lcom/kik/cards/web/auth/b;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/auth/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/a;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/kik/cards/web/auth/b;->a:Lcom/kik/cards/web/auth/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 86
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/auth/b;->a:Lcom/kik/cards/web/auth/a;

    invoke-static {v0}, Lcom/kik/cards/web/auth/a;->a(Lcom/kik/cards/web/auth/a;)V

    :cond_0
    return-void
.end method
