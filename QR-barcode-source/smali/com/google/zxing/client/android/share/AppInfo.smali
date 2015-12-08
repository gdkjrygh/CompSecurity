.class final Lcom/google/zxing/client/android/share/AppInfo;
.super Ljava/lang/Object;
.source "AppInfo.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/zxing/client/android/share/AppInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final icon:Landroid/graphics/drawable/Drawable;

.field private final label:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "packageName"    # Ljava/lang/String;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/google/zxing/client/android/share/AppInfo;->packageName:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/google/zxing/client/android/share/AppInfo;->icon:Landroid/graphics/drawable/Drawable;

    .line 31
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/google/zxing/client/android/share/AppInfo;)I
    .locals 2
    .param p1, "another"    # Lcom/google/zxing/client/android/share/AppInfo;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/google/zxing/client/android/share/AppInfo;

    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/share/AppInfo;->compareTo(Lcom/google/zxing/client/android/share/AppInfo;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 62
    instance-of v1, p1, Lcom/google/zxing/client/android/share/AppInfo;

    if-nez v1, :cond_0

    .line 63
    const/4 v1, 0x0

    .line 66
    :goto_0
    return v1

    :cond_0
    move-object v0, p1

    .line 65
    check-cast v0, Lcom/google/zxing/client/android/share/AppInfo;

    .line 66
    .local v0, "another":Lcom/google/zxing/client/android/share/AppInfo;
    iget-object v1, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    iget-object v2, v0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->icon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    return-object v0
.end method

.method getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppInfo;->label:Ljava/lang/String;

    return-object v0
.end method
