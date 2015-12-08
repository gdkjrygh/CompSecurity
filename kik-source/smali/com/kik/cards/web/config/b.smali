.class final Lcom/kik/cards/web/config/b;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:Lcom/kik/cards/web/plugin/a;

.field final synthetic d:Lcom/kik/cards/web/config/XDataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Ljava/lang/Class;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/cards/web/config/b;->d:Lcom/kik/cards/web/config/XDataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/config/b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/config/b;->b:Ljava/lang/Class;

    iput-object p4, p0, Lcom/kik/cards/web/config/b;->c:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 73
    iget-object v0, p0, Lcom/kik/cards/web/config/b;->d:Lcom/kik/cards/web/config/XDataPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/config/b;->a:Ljava/lang/String;

    check-cast p1, Lcom/b/a/n;

    iget-object v2, p0, Lcom/kik/cards/web/config/b;->b:Ljava/lang/Class;

    invoke-static {v0, v1, p1, v2}, Lcom/kik/cards/web/config/XDataPlugin;->a(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Class;)Lorg/json/JSONObject;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/kik/cards/web/config/b;->c:Lcom/kik/cards/web/plugin/a;

    new-instance v2, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v2, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 76
    return-void
.end method
