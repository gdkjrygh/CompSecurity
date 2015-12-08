.class final Lkik/android/chat/fragment/pj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/pi;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/pi;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lkik/android/chat/fragment/pj;->a:Lkik/android/chat/fragment/pi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 307
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 308
    return-void
.end method
