.class final Lkik/android/scan/fragment/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/scan/KikCode;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 426
    iput-object p1, p0, Lkik/android/scan/fragment/t;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/t;->a:Lcom/kik/scan/KikCode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Lkik/android/scan/fragment/t;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->h(Lkik/android/scan/fragment/ScanFragment;)V

    .line 431
    iget-object v0, p0, Lkik/android/scan/fragment/t;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/t;->a:Lcom/kik/scan/KikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->c(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    .line 432
    return-void
.end method
