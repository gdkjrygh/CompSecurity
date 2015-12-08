.class final Lcom/mixpanel/android/surveys/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/surveys/CardCarouselLayout;

.field final synthetic b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/CardCarouselLayout$d;Lcom/mixpanel/android/surveys/CardCarouselLayout;)V
    .locals 0

    .prologue
    .line 466
    iput-object p1, p0, Lcom/mixpanel/android/surveys/c;->b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;

    iput-object p2, p0, Lcom/mixpanel/android/surveys/c;->a:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .prologue
    .line 469
    iget-object v0, p0, Lcom/mixpanel/android/surveys/c;->b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;

    iget-object v0, v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$d;->a:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-static {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->a(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 470
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 472
    iget-object v1, p0, Lcom/mixpanel/android/surveys/c;->b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;

    iget-object v1, v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$d;->a:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    new-instance v2, Lcom/mixpanel/android/surveys/d;

    invoke-direct {v2, p0, v0}, Lcom/mixpanel/android/surveys/d;-><init>(Lcom/mixpanel/android/surveys/c;Ljava/lang/String;)V

    const-wide/16 v4, 0xa5

    invoke-virtual {v1, v2, v4, v5}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 479
    :cond_0
    return-void
.end method
