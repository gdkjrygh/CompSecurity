.class final Lkik/android/chat/fragment/hv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/hr;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/hr;)V
    .locals 0

    .prologue
    .line 326
    iput-object p1, p0, Lkik/android/chat/fragment/hv;->a:Lkik/android/chat/fragment/hr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 331
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 332
    return-void
.end method
