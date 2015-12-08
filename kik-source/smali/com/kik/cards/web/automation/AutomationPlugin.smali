.class public Lcom/kik/cards/web/automation/AutomationPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/cards/web/automation/a;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/automation/a;)V
    .locals 1

    .prologue
    .line 22
    const-string v0, "Automation"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Lcom/kik/cards/web/automation/AutomationPlugin;->a:Lcom/kik/cards/web/automation/a;

    .line 24
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/kik/cards/web/automation/AutomationPlugin;->a:Lcom/kik/cards/web/automation/a;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/automation/AutomationPlugin;->a:Lcom/kik/cards/web/automation/a;

    invoke-virtual {v0}, Lcom/kik/cards/web/automation/a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final f_()V
    .locals 1

    .prologue
    .line 37
    invoke-super {p0}, Lcom/kik/cards/web/plugin/d;->f_()V

    .line 38
    iget-object v0, p0, Lcom/kik/cards/web/automation/AutomationPlugin;->a:Lcom/kik/cards/web/automation/a;

    invoke-virtual {v0}, Lcom/kik/cards/web/automation/a;->b()V

    .line 39
    return-void
.end method

.method public inspect(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 29
    const-string v0, "result"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/kik/cards/web/automation/AutomationPlugin;->a:Lcom/kik/cards/web/automation/a;

    invoke-virtual {v1, v0}, Lcom/kik/cards/web/automation/a;->b(Ljava/lang/String;)V

    .line 31
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method
