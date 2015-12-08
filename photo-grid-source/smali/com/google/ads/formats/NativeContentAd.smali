.class public interface abstract Lcom/google/ads/formats/NativeContentAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeAd;


# static fields
.field public static final ASSET_ADVERTISER:I = 0x3ec

.field public static final ASSET_ATTRIBUTION_ICON:I = 0x3ef

.field public static final ASSET_ATTRIBUTION_TEXT:I = 0x3f0

.field public static final ASSET_BODY:I = 0x3ea

.field public static final ASSET_CALL_TO_ACTION:I = 0x3eb

.field public static final ASSET_HEADLINE:I = 0x3e9

.field public static final ASSET_IMAGE:I = 0x3ed

.field public static final ASSET_LOGO:I = 0x3ee


# virtual methods
.method public abstract getAdvertiser()Ljava/lang/String;
.end method

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

.method public abstract getImage()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getLogo()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract hasAttribution()Z
.end method
