.class final Lcom/kik/cards/web/config/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:Lcom/kik/cards/web/config/XDataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/kik/cards/web/config/c;->c:Lcom/kik/cards/web/config/XDataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/config/c;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/config/c;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 107
    iget-object v0, p0, Lcom/kik/cards/web/config/c;->c:Lcom/kik/cards/web/config/XDataPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/config/c;->a:Ljava/lang/String;

    check-cast p1, Lcom/b/a/n;

    iget-object v2, p0, Lcom/kik/cards/web/config/c;->b:Ljava/lang/Class;

    invoke-static {v0, v1, p1, v2}, Lcom/kik/cards/web/config/XDataPlugin;->a(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Class;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
