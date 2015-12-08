.class final Lkik/android/chat/fragment/jr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/jq;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/jq;)V
    .locals 0

    .prologue
    .line 454
    iput-object p1, p0, Lkik/android/chat/fragment/jr;->a:Lkik/android/chat/fragment/jq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 458
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 459
    return-void
.end method
