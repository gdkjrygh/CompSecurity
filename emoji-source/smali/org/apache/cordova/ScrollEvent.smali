.class public Lorg/apache/cordova/ScrollEvent;
.super Ljava/lang/Object;
.source "ScrollEvent.java"


# instance fields
.field public l:I

.field public nl:I

.field public nt:I

.field public t:I

.field private targetView:Landroid/view/View;


# direct methods
.method constructor <init>(IIIILandroid/view/View;)V
    .locals 0
    .param p1, "nx"    # I
    .param p2, "ny"    # I
    .param p3, "x"    # I
    .param p4, "y"    # I
    .param p5, "view"    # Landroid/view/View;

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p3, p0, Lorg/apache/cordova/ScrollEvent;->l:I

    iget p4, p0, Lorg/apache/cordova/ScrollEvent;->t:I

    iput p1, p0, Lorg/apache/cordova/ScrollEvent;->nl:I

    iput p2, p0, Lorg/apache/cordova/ScrollEvent;->nt:I

    .line 49
    iput-object p5, p0, Lorg/apache/cordova/ScrollEvent;->targetView:Landroid/view/View;

    .line 50
    return-void
.end method


# virtual methods
.method public dl()I
    .locals 2

    .prologue
    .line 54
    iget v0, p0, Lorg/apache/cordova/ScrollEvent;->nl:I

    iget v1, p0, Lorg/apache/cordova/ScrollEvent;->l:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public dt()I
    .locals 2

    .prologue
    .line 59
    iget v0, p0, Lorg/apache/cordova/ScrollEvent;->nt:I

    iget v1, p0, Lorg/apache/cordova/ScrollEvent;->t:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getTargetView()Landroid/view/View;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/apache/cordova/ScrollEvent;->targetView:Landroid/view/View;

    return-object v0
.end method
