.class public interface abstract Lcom/google/ads/formats/NativeAppInstallAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeAd;


# static fields
.field public static final ASSET_ATTRIBUTION_ICON:I = 0x7d9

.field public static final ASSET_ATTRIBUTION_TEXT:I = 0x7da

.field public static final ASSET_BODY:I = 0x7d4

.field public static final ASSET_CALL_TO_ACTION:I = 0x7d2

.field public static final ASSET_HEADLINE:I = 0x7d1

.field public static final ASSET_ICON:I = 0x7d3

.field public static final ASSET_IMAGE:I = 0x7d7

.field public static final ASSET_PRICE:I = 0x7d6

.field public static final ASSET_STAR_RATING:I = 0x7d8

.field public static final ASSET_STORE:I = 0x7d5


# virtual methods
.method public abstract getAttributionIcon()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getAttributionText()Ljava/lang/String;
.end method

.method public abstract getBody()Ljava/lang/String;
.end method

.method public abstract getCallToAction()Ljava/lang/String;
.end method

.method public abstract getHeadline()Ljava/lang/String;
.end method

.method public abstract getIcon()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getImage()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getPrice()Ljava/lang/String;
.end method

.method public abstract getStarRating()Ljava/lang/Double;
.end method

.method public abstract getStore()Ljava/lang/String;
.end method

.method public abstract hasAttribution()Z
.end method
