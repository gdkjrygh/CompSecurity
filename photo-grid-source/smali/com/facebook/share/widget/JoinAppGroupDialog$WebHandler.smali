.class Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;
.super Lcom/facebook/internal/FacebookDialogBase$ModeHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/FacebookDialogBase",
        "<",
        "Ljava/lang/String;",
        "Lcom/facebook/share/widget/JoinAppGroupDialog$Result;",
        ">.ModeHandler;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/widget/JoinAppGroupDialog;


# direct methods
.method private constructor <init>(Lcom/facebook/share/widget/JoinAppGroupDialog;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;->this$0:Lcom/facebook/share/widget/JoinAppGroupDialog;

    invoke-direct {p0, p1}, Lcom/facebook/internal/FacebookDialogBase$ModeHandler;-><init>(Lcom/facebook/internal/FacebookDialogBase;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/widget/JoinAppGroupDialog;Lcom/facebook/share/widget/JoinAppGroupDialog$1;)V
    .locals 0

    .prologue
    .line 161
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;-><init>(Lcom/facebook/share/widget/JoinAppGroupDialog;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic canShow(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 161
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;->canShow(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public canShow(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic createAppCall(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;
    .locals 1

    .prologue
    .line 161
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;->createAppCall(Ljava/lang/String;)Lcom/facebook/internal/AppCall;

    move-result-object v0

    return-object v0
.end method

.method public createAppCall(Ljava/lang/String;)Lcom/facebook/internal/AppCall;
    .locals 3

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;->this$0:Lcom/facebook/share/widget/JoinAppGroupDialog;

    invoke-virtual {v0}, Lcom/facebook/share/widget/JoinAppGroupDialog;->createBaseAppCall()Lcom/facebook/internal/AppCall;

    move-result-object v0

    .line 170
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v2, "id"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v2, "game_group_join"

    invoke-static {v0, v2, v1}, Lcom/facebook/internal/DialogPresenter;->setupAppCallForWebDialog(Lcom/facebook/internal/AppCall;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 178
    return-object v0
.end method
