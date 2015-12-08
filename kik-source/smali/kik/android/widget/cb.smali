.class final Lkik/android/widget/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/widget/KikContactImageThumbNailList;


# direct methods
.method constructor <init>(Lkik/android/widget/KikContactImageThumbNailList;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Lkik/android/widget/cb;->b:Lkik/android/widget/KikContactImageThumbNailList;

    iput-object p2, p0, Lkik/android/widget/cb;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lkik/android/widget/cb;->b:Lkik/android/widget/KikContactImageThumbNailList;

    invoke-static {v0}, Lkik/android/widget/KikContactImageThumbNailList;->b(Lkik/android/widget/KikContactImageThumbNailList;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/cb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 201
    return-void
.end method
