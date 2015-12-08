.class final Lcom/kik/cards/web/plugin/h$b;
.super Lcom/kik/g/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/plugin/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/plugin/h;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/plugin/h;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/kik/cards/web/plugin/h$b;->b:Lcom/kik/cards/web/plugin/h;

    .line 41
    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    .line 42
    iput-object p2, p0, Lcom/kik/cards/web/plugin/h$b;->a:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/plugin/f;)V
    .locals 5

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h$b;->b:Lcom/kik/cards/web/plugin/h;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/h;)Lcom/kik/cards/web/ax;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    invoke-static {}, Lcom/kik/cards/web/plugin/h;->e()Lorg/c/b;

    move-result-object v0

    const-string v1, "Firing event: {}"

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h$b;->b:Lcom/kik/cards/web/plugin/h;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/h;)Lcom/kik/cards/web/ax;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/plugin/h$b;->a:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/f;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/f;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-interface {v0, v1, v2}, Lcom/kik/cards/web/ax;->a(Ljava/lang/String;[Ljava/lang/String;)V

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_0
    invoke-static {}, Lcom/kik/cards/web/plugin/h;->e()Lorg/c/b;

    move-result-object v0

    const-string v1, "Error firing event {}, no invoker"

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/c/b;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 37
    check-cast p2, Lcom/kik/cards/web/plugin/f;

    invoke-virtual {p0, p2}, Lcom/kik/cards/web/plugin/h$b;->a(Lcom/kik/cards/web/plugin/f;)V

    return-void
.end method
