.class final Lkik/android/chat/fragment/fo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/fn;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/fn;)V
    .locals 0

    .prologue
    .line 748
    iput-object p1, p0, Lkik/android/chat/fragment/fo;->a:Lkik/android/chat/fragment/fn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 753
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 754
    return-void
.end method
