.class final Lkik/android/chat/activity/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lkik/android/chat/activity/KikIqActivityBase;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/KikIqActivityBase;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lkik/android/chat/activity/ah;->b:Lkik/android/chat/activity/KikIqActivityBase;

    iput-object p2, p0, Lkik/android/chat/activity/ah;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lkik/android/chat/activity/ah;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 116
    return-void
.end method
