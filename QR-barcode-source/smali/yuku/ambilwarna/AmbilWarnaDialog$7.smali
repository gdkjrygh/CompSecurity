.class Lyuku/ambilwarna/AmbilWarnaDialog$7;
.super Ljava/lang/Object;
.source "AmbilWarnaDialog.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyuku/ambilwarna/AmbilWarnaDialog;-><init>(Landroid/content/Context;IZLyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

.field private final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lyuku/ambilwarna/AmbilWarnaDialog;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iput-object p2, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->val$view:Landroid/view/View;

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveCursor()V

    .line 211
    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # getter for: Lyuku/ambilwarna/AmbilWarnaDialog;->supportsAlpha:Z
    invoke-static {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$7(Lyuku/ambilwarna/AmbilWarnaDialog;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveAlphaCursor()V

    .line 212
    :cond_0
    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveTarget()V

    .line 213
    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # getter for: Lyuku/ambilwarna/AmbilWarnaDialog;->supportsAlpha:Z
    invoke-static {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$7(Lyuku/ambilwarna/AmbilWarnaDialog;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->updateAlphaView()V
    invoke-static {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$3(Lyuku/ambilwarna/AmbilWarnaDialog;)V

    .line 214
    :cond_1
    iget-object v0, p0, Lyuku/ambilwarna/AmbilWarnaDialog$7;->val$view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 215
    return-void
.end method
