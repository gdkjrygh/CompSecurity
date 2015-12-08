.class final Lkik/android/chat/fragment/nk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPickContactFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPickContactFragment;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lkik/android/chat/fragment/nk;->a:Lkik/android/chat/fragment/KikPickContactFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 99
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 100
    return-void
.end method
