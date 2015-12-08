.class public final Lcom/facebook/share/widget/AppInviteDialog$Result;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/share/widget/AppInviteDialog$Result;->bundle:Landroid/os/Bundle;

    .line 57
    return-void
.end method


# virtual methods
.method public final getData()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/share/widget/AppInviteDialog$Result;->bundle:Landroid/os/Bundle;

    return-object v0
.end method
