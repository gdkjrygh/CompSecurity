.class public Lcom/googlecode/flickrjandroid/photos/Rectangle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public height:I

.field public width:I

.field public x:I

.field public y:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    .line 71
    iput p2, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    .line 72
    iput p3, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    .line 73
    iput p4, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    .line 74
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 151
    if-ne p0, p1, :cond_1

    .line 166
    :cond_0
    :goto_0
    return v0

    .line 153
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 154
    goto :goto_0

    .line 155
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;

    if-nez v2, :cond_3

    move v0, v1

    .line 156
    goto :goto_0

    .line 157
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;

    .line 158
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 159
    goto :goto_0

    .line 160
    :cond_4
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 161
    goto :goto_0

    .line 162
    :cond_5
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 163
    goto :goto_0

    .line 164
    :cond_6
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 165
    goto :goto_0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 108
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    return v0
.end method

.method public getX()I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    return v0
.end method

.method public getY()I
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 139
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    add-int/lit8 v0, v0, 0x1f

    .line 140
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    add-int/2addr v0, v1

    .line 141
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    add-int/2addr v0, v1

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    add-int/2addr v0, v1

    .line 143
    return v0
.end method

.method public setHeight(I)V
    .locals 0

    .prologue
    .line 129
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->height:I

    .line 130
    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .prologue
    .line 115
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->width:I

    .line 116
    return-void
.end method

.method public setX(I)V
    .locals 0

    .prologue
    .line 87
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->x:I

    .line 88
    return-void
.end method

.method public setY(I)V
    .locals 0

    .prologue
    .line 101
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Rectangle;->y:I

    .line 102
    return-void
.end method
