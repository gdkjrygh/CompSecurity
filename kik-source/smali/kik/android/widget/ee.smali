.class final Lkik/android/widget/ee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lkik/android/widget/ThumbNailListView;


# direct methods
.method constructor <init>(Lkik/android/widget/ThumbNailListView;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lkik/android/widget/ee;->b:Lkik/android/widget/ThumbNailListView;

    iput-object p2, p0, Lkik/android/widget/ee;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lkik/android/widget/ee;->b:Lkik/android/widget/ThumbNailListView;

    invoke-static {v0}, Lkik/android/widget/ThumbNailListView;->a(Lkik/android/widget/ThumbNailListView;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/ee;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 100
    return-void
.end method
