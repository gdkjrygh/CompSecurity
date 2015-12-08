.class final Lcom/scannerfire/fragment/TabsAdapter$TabInfo;
.super Ljava/lang/Object;
.source "TabsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/fragment/TabsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "TabInfo"
.end annotation


# instance fields
.field private final args:Landroid/os/Bundle;

.field private final clss:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final tag:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "_tag"    # Ljava/lang/String;
    .param p3, "_args"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .prologue
    .line 28
    .local p2, "_class":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->tag:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->clss:Ljava/lang/Class;

    .line 31
    iput-object p3, p0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->args:Landroid/os/Bundle;

    .line 32
    return-void
.end method

.method static synthetic access$0(Lcom/scannerfire/fragment/TabsAdapter$TabInfo;)Ljava/lang/Class;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->clss:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic access$1(Lcom/scannerfire/fragment/TabsAdapter$TabInfo;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->args:Landroid/os/Bundle;

    return-object v0
.end method
