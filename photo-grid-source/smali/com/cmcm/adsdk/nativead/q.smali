.class final Lcom/cmcm/adsdk/nativead/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/n;


# direct methods
.method private constructor <init>(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 285
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/q;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 286
    return-void
.end method

.method synthetic constructor <init>(Lcom/cmcm/adsdk/nativead/n;B)V
    .locals 0

    .prologue
    .line 284
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/q;-><init>(Lcom/cmcm/adsdk/nativead/n;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/q;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/n;->k()V

    .line 290
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 294
    const/4 v0, 0x0

    return v0
.end method
