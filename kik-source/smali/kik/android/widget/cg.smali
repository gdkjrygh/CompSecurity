.class final Lkik/android/widget/cg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lkik/android/widget/cg;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 66
    invoke-static {}, Lkik/android/widget/ce;->a()Z

    .line 67
    iget-object v0, p0, Lkik/android/widget/cg;->a:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/widget/ce;->a(Landroid/content/Context;)V

    .line 69
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 70
    return-void
.end method
