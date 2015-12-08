.class public Lorg/chromium/ui/ColorSuggestion;
.super Ljava/lang/Object;
.source "ColorSuggestion.java"


# instance fields
.field final mColor:I

.field final mLabel:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p1, "color"    # I
    .param p2, "label"    # Ljava/lang/String;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p1, p0, Lorg/chromium/ui/ColorSuggestion;->mColor:I

    .line 22
    iput-object p2, p0, Lorg/chromium/ui/ColorSuggestion;->mLabel:Ljava/lang/String;

    .line 23
    return-void
.end method
