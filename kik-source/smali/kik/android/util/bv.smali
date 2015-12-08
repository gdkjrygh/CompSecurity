.class final Lkik/android/util/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/widget/ListView;

.field final synthetic b:I


# direct methods
.method constructor <init>(Landroid/widget/ListView;I)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lkik/android/util/bv;->a:Landroid/widget/ListView;

    iput p2, p0, Lkik/android/util/bv;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lkik/android/util/bv;->a:Landroid/widget/ListView;

    iget v1, p0, Lkik/android/util/bv;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setTranscriptMode(I)V

    .line 97
    return-void
.end method
