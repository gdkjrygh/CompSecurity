.class final Lkik/android/chat/activity/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/KikCropActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/KikCropActivity;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lkik/android/chat/activity/af;->a:Lkik/android/chat/activity/KikCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lkik/android/chat/activity/af;->a:Lkik/android/chat/activity/KikCropActivity;

    invoke-static {v0}, Lkik/android/chat/activity/KikCropActivity;->b(Lkik/android/chat/activity/KikCropActivity;)Lkik/android/widget/KikCropView;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/KikCropView;->b()V

    .line 94
    return-void
.end method
