.class final Lcom/mixpanel/android/surveys/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mixpanel/android/surveys/c;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/c;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/mixpanel/android/surveys/d;->b:Lcom/mixpanel/android/surveys/c;

    iput-object p2, p0, Lcom/mixpanel/android/surveys/d;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 475
    iget-object v0, p0, Lcom/mixpanel/android/surveys/d;->b:Lcom/mixpanel/android/surveys/c;

    iget-object v0, v0, Lcom/mixpanel/android/surveys/c;->b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;

    iget-object v0, v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$d;->a:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-static {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->a(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$c;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/surveys/d;->b:Lcom/mixpanel/android/surveys/c;

    iget-object v1, v1, Lcom/mixpanel/android/surveys/c;->b:Lcom/mixpanel/android/surveys/CardCarouselLayout$d;

    invoke-static {v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$d;->a(Lcom/mixpanel/android/surveys/CardCarouselLayout$d;)Lcom/mixpanel/android/mpmetrics/Survey$a;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/surveys/d;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$c;->a(Lcom/mixpanel/android/mpmetrics/Survey$a;Ljava/lang/String;)V

    .line 476
    return-void
.end method
