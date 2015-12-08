.class final Lkik/android/chat/fragment/qh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/qg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/qg;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lkik/android/chat/fragment/qh;->a:Lkik/android/chat/fragment/qg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 106
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 107
    return-void
.end method
